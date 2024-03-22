/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.sapcomm.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.sapcomm.fulfilmentprocess.constants.SapcommFulfilmentProcessConstants;

public class SapcommFulfilmentProcessManager extends GeneratedSapcommFulfilmentProcessManager
{
	public static final SapcommFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcommFulfilmentProcessManager) em.getExtension(SapcommFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
