 import java.util.logging.*;
import org.aspectj.lang.*;

	public aspect loging
	{
	private Logger lgr=Logger.getLogger("MyLogger");
	
	piontcut logmeths(): call(* *.*(..));
	
	before(): logmeths()
 	Signature sig=thisJionPointStaticPart.getSignature();
	lgr.logp(Level.SEVERE,sig.getDeclaringType().getName(),sig.getName(), "Status:Done");
}
}