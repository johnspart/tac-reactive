package co.com.tac.cdi;

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
		tx.begin();
		System.out.println("Starting transaction");
		Object result = context.proceed();
		tx.commit();
		System.out.println("Committing transaction");

		return result;
	}
}
