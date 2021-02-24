import java.util.logging.*;
import org.aspectj.lang.*;
public aspect logging
{
	private Logger  lgr=Logger.getLogger("My Logger");
	pointcut logmeths():execution(* LPU.*(..));
	before():logmeths()
	{
		Signature sig=thisJoinPointStaticPart.getSignature();
		lgr.logp(Level.SEVERE,sig.getDeclaringType().getName(),sig.getName(), "WELCOME");
		System.out.println("Welcome Mr/Ms :" + sig.getName());
	}
	after():logmeths()
	{
		Signature sig=thisJoinPointStaticPart.getSignature();
		lgr.logp(Level.SEVERE,sig.getDeclaringType().getName(),sig.getName(), "THANKS");
		System.out.println("Thanks Mr/Ms :" + sig.getName());
	}
    
}