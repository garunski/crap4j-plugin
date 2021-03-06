package hudson.plugins.crap4j;

import hudson.model.Run;
import hudson.plugins.crap4j.display.AbstractCrapMethodPresentation;
import hudson.plugins.crap4j.model.IMethodCrap;

public class NewCrapMethodsResult extends AbstractCrapMethodPresentation {

	private final IMethodCrap[] methods;

	public NewCrapMethodsResult(Run<?, ?> owner,
			IMethodCrap... methods) {
		super(owner, "New Crap Methods for " + owner.getDisplayName());
		this.methods = methods;
	}
	
	@Override
	protected IMethodCrap[] loadMethods() {
		return this.methods;
	}
}
