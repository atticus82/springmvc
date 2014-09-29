package amm.spring.common.exception;

import java.util.Locale;

import org.springframework.web.servlet.ModelAndView;

public class SpringMVCException extends Exception{
	
	private String context;

    private String reason;

    private String code;

    private String label;

    private String description;

    private Locale locale;
    
    
    private String page;
    
    private ModelAndView model;
    
    public SpringMVCException(String code){
        super();
        this.code = code;
    }
    
    public SpringMVCException(String code, Locale locale){
        super();
        this.code = code;
        this.locale = locale;
    }
    

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public ModelAndView getModel() {
		return model;
	}


	public void setModel(ModelAndView model) {
		this.model = model;
	}

}
