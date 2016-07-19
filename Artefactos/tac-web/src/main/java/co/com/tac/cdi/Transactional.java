package co.com.tac.cdi;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.transaction.UserTransaction;

@TxInterceptorBinding
@Interceptor
public class Transactional {
	@Resource
	UserTransaction tx;

	@AroundInvoke
	public Object manageTransaction(InvocationContext context) throws Exception {
		Object result = null;
		boolean notReadOnly = !context.getMethod().getDeclaredAnnotation(TxInterceptorBinding.class).readOnly();
		List<Class<? extends Throwable>> noRollbackFor = Arrays
				.asList(context.getMethod().getDeclaredAnnotation(TxInterceptorBinding.class).noRollbackFor());
		if (notReadOnly)
			tx.begin();
		System.out.println("Starting transaction");
		try {
			result = context.proceed();
		} catch (Throwable e) {
			if (notReadOnly)
				if (noRollbackFor.contains(e))
					tx.rollback();

		}
		if (notReadOnly)
			tx.commit();
		System.out.println("Committing transaction");

		return result;
	}
}
