/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 24-Jun-2024, 1:24:41 pm                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.sapcomm.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.sapcomm.core.constants.SapcommCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob MemberDetailsCronjob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMemberDetailsCronjob extends CronJob
{
	/** Qualifier of the <code>MemberDetailsCronjob.ages</code> attribute **/
	public static final String AGES = "ages";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AGES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetailsCronjob.ages</code> attribute.
	 * @return the ages - This is the used to identify the age of the customers
	 */
	public Byte getAges(final SessionContext ctx)
	{
		return (Byte)getProperty( ctx, AGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetailsCronjob.ages</code> attribute.
	 * @return the ages - This is the used to identify the age of the customers
	 */
	public Byte getAges()
	{
		return getAges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetailsCronjob.ages</code> attribute. 
	 * @return the ages - This is the used to identify the age of the customers
	 */
	public byte getAgesAsPrimitive(final SessionContext ctx)
	{
		Byte value = getAges( ctx );
		return value != null ? value.byteValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetailsCronjob.ages</code> attribute. 
	 * @return the ages - This is the used to identify the age of the customers
	 */
	public byte getAgesAsPrimitive()
	{
		return getAgesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetailsCronjob.ages</code> attribute. 
	 * @param value the ages - This is the used to identify the age of the customers
	 */
	public void setAges(final SessionContext ctx, final Byte value)
	{
		setProperty(ctx, AGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetailsCronjob.ages</code> attribute. 
	 * @param value the ages - This is the used to identify the age of the customers
	 */
	public void setAges(final Byte value)
	{
		setAges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetailsCronjob.ages</code> attribute. 
	 * @param value the ages - This is the used to identify the age of the customers
	 */
	public void setAges(final SessionContext ctx, final byte value)
	{
		setAges( ctx,Byte.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetailsCronjob.ages</code> attribute. 
	 * @param value the ages - This is the used to identify the age of the customers
	 */
	public void setAges(final byte value)
	{
		setAges( getSession().getSessionContext(), value );
	}
	
}
