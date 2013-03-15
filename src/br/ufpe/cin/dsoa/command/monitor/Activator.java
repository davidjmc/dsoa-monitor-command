package br.ufpe.cin.dsoa.command.monitor;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private transient BundleContext bc = null;

	@Override
	public void start(BundleContext context) throws Exception {

		bc = context;
		context.registerService(org.apache.felix.shell.Command.class.getName(),
				new MonitorCommand(bc), null);

	}

	@Override
	public void stop(BundleContext context) throws Exception {

		// Services are automatically unregistered so
		// we don't have to unregister the factory here.
	}

}
