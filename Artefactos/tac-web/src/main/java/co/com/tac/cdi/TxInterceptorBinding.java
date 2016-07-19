/**
 * 
 */
package co.com.tac.cdi;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.interceptor.InterceptorBinding;

/**
 * @author john
 *
 */
@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target({ METHOD, TYPE })
public @interface TxInterceptorBinding {
	@Nonbinding
	boolean readOnly() default false;

	@Nonbinding
	Class<? extends Throwable>[] noRollbackFor() default {};
}