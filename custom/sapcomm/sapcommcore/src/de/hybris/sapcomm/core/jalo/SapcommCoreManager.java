/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.sapcomm.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.sapcomm.core.constants.SapcommCoreConstants;
import de.hybris.sapcomm.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class SapcommCoreManager extends GeneratedSapcommCoreManager
{
	public static final SapcommCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SapcommCoreManager) em.getExtension(SapcommCoreConstants.EXTENSIONNAME);
	}
}
