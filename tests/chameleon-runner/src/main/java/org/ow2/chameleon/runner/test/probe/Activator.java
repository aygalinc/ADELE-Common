package org.ow2.chameleon.runner.test.probe;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.ow2.chameleon.runner.test.shared.InVivoRunnerFactory;

/**
 * The probe activator.
 */
public class Activator implements BundleActivator {

    private InVivoRunnerFactory factory;
    private ServiceRegistration<InVivoRunnerFactory> registration;

    @Override
    public void start(BundleContext context) throws Exception {
        factory = new InVivoRunnerFactory(context);
        registration = context.registerService(InVivoRunnerFactory.class, factory, null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        registration.unregister();
    }
}
