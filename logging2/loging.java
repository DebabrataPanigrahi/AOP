import java.util.logging.*;
import org.aspectj.lang.*;

	public aspect loging
	   {
	    private Logger lgr=Logger.getLogger("MyLogger");
	
	    pointcut logmeths():call(* Event1.*(..));
	
	    before(): logmeths()
		{
 	    Signature sig=thisJoinPointStaticPart.getSignature();
	    lgr.logp(Level.SEVERE,sig.getDeclaringType().getName(),sig.getName(), "Status:Done");
            }
        }