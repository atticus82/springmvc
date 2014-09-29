package amm.spring.common.vo;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import amm.spring.common.constants.SpringMVCConstants;

public class BaseVO {
	
	 private static final Logger LOGGER = Logger.getLogger(SpringMVCConstants.LOGGER_NAME);
	 
	  /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Sobreescribe el método toString para los VO's.
     *
     * @author alejandro.marco
     * @return String
     */
    public final String toString() {
        final StringBuffer result = new StringBuffer();
        boolean comma = false;
        result.append("\n[");
        for (Method method : this.getClass().getMethods()) {
            final String methodName = method.getName();
            if ((methodName.startsWith("get") || methodName.startsWith("is"))
                    && !methodName.startsWith("getClass")) {
                result.append(comma ? ", " : "");
                comma = true;
                result.append(methodName.startsWith("is") ? methodName
                        .substring(2) : methodName.substring(3));
                result.append(":");
                try {
                    final Object obj = method.invoke(this, null);
                    result.append(obj != null ? obj : "null");
                } catch (Exception e) {
                    result.append("null(E)");
                    LOGGER.error(e.getLocalizedMessage(),e);
                }
            }
        }
        result.append("]");
        return result.toString();
    }
}
