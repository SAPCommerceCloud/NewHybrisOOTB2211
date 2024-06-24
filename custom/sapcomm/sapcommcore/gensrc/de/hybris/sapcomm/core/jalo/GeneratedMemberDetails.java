/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 24-Jun-2024, 1:24:41 pm                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.sapcomm.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.sapcomm.core.constants.SapcommCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MemberDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMemberDetails extends GenericItem
{
	/** Qualifier of the <code>MemberDetails.memberName</code> attribute **/
	public static final String MEMBERNAME = "memberName";
	/** Qualifier of the <code>MemberDetails.memberAge</code> attribute **/
	public static final String MEMBERAGE = "memberAge";
	/** Qualifier of the <code>MemberDetails.memberBloodGroup</code> attribute **/
	public static final String MEMBERBLOODGROUP = "memberBloodGroup";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MEMBERNAME, AttributeMode.INITIAL);
		tmp.put(MEMBERAGE, AttributeMode.INITIAL);
		tmp.put(MEMBERBLOODGROUP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberAge</code> attribute.
	 * @return the memberAge - This is used to gather the user age
	 */
	public Byte getMemberAge(final SessionContext ctx)
	{
		return (Byte)getProperty( ctx, MEMBERAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberAge</code> attribute.
	 * @return the memberAge - This is used to gather the user age
	 */
	public Byte getMemberAge()
	{
		return getMemberAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberAge</code> attribute. 
	 * @return the memberAge - This is used to gather the user age
	 */
	public byte getMemberAgeAsPrimitive(final SessionContext ctx)
	{
		Byte value = getMemberAge( ctx );
		return value != null ? value.byteValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberAge</code> attribute. 
	 * @return the memberAge - This is used to gather the user age
	 */
	public byte getMemberAgeAsPrimitive()
	{
		return getMemberAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberAge</code> attribute. 
	 * @param value the memberAge - This is used to gather the user age
	 */
	public void setMemberAge(final SessionContext ctx, final Byte value)
	{
		setProperty(ctx, MEMBERAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberAge</code> attribute. 
	 * @param value the memberAge - This is used to gather the user age
	 */
	public void setMemberAge(final Byte value)
	{
		setMemberAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberAge</code> attribute. 
	 * @param value the memberAge - This is used to gather the user age
	 */
	public void setMemberAge(final SessionContext ctx, final byte value)
	{
		setMemberAge( ctx,Byte.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberAge</code> attribute. 
	 * @param value the memberAge - This is used to gather the user age
	 */
	public void setMemberAge(final byte value)
	{
		setMemberAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberBloodGroup</code> attribute.
	 * @return the memberBloodGroup - This will show the User Blood Group
	 */
	public String getMemberBloodGroup(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEMBERBLOODGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberBloodGroup</code> attribute.
	 * @return the memberBloodGroup - This will show the User Blood Group
	 */
	public String getMemberBloodGroup()
	{
		return getMemberBloodGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberBloodGroup</code> attribute. 
	 * @param value the memberBloodGroup - This will show the User Blood Group
	 */
	public void setMemberBloodGroup(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEMBERBLOODGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberBloodGroup</code> attribute. 
	 * @param value the memberBloodGroup - This will show the User Blood Group
	 */
	public void setMemberBloodGroup(final String value)
	{
		setMemberBloodGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberName</code> attribute.
	 * @return the memberName - Is for the MemberName
	 */
	public String getMemberName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEMBERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MemberDetails.memberName</code> attribute.
	 * @return the memberName - Is for the MemberName
	 */
	public String getMemberName()
	{
		return getMemberName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberName</code> attribute. 
	 * @param value the memberName - Is for the MemberName
	 */
	public void setMemberName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEMBERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MemberDetails.memberName</code> attribute. 
	 * @param value the memberName - Is for the MemberName
	 */
	public void setMemberName(final String value)
	{
		setMemberName( getSession().getSessionContext(), value );
	}
	
}
