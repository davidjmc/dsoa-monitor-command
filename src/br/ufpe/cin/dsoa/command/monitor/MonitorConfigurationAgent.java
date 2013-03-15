package br.ufpe.cin.dsoa.command.monitor;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import br.ufpe.cin.dsoa.management.MetricId;
import br.ufpe.cin.dsoa.management.ServiceMetricManager;

public class MonitorConfigurationAgent {

	public static void addMetric(BundleContext bc, String category,
			String attribute, String serviceId, String operation) {
		MetricId metricId = new MetricId(category, attribute);
		ServiceReference sf = bc.getServiceReference(ServiceMetricManager.class
				.getName());
		ServiceMetricManager smm = (ServiceMetricManager) bc.getService(sf);
		smm.addMetric(metricId, serviceId, operation);
	}
}
