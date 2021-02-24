
import java.util.logging.*;
import org.aspectj.lang.*;
public aspect logging
{
	private Logger  lgr=Logger.getLogger("My Logger");
	pointcut logmeths():execution(* *.*(..));
	before():logmeths()
	{
		Signature sig=thisJoinPointStaticPart.getSignature();
		lgr.logp(Level.SEVERE,sig.getDeclaringType().getName(),sig.getName(), "Status :DONE");
		
	}
    
}