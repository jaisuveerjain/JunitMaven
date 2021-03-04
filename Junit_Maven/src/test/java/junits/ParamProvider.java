package junits;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

 

 

 

public class ParamProvider implements ParameterResolver{
    @Override
    public Object resolveParameter(ParameterContext arg0, ExtensionContext arg1) throws ParameterResolutionException {
        // TODO Auto-generated method stub
        //return null;
        
        String name = "Akshara";
        return name;
    }
    @Override
    public boolean supportsParameter(ParameterContext arg0, ExtensionContext arg1) throws ParameterResolutionException {
        // TODO Auto-generated method stub
        return arg0.getParameter().getType() ==    String.class;
    }

}



