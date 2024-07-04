/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.sapcomm.fulfilmentprocess.actions.order;

import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.apache.log4j.Logger;


/**
 * This example action checks the order for required data in the business process. Skipping this action may result in
 * failure in one of the subsequent steps of the process. The relation between the order and the business process is
 * defined in basecommerce extension through item OrderProcess. Therefore if your business process has to access the
 * order (a typical case), it is recommended to use the OrderProcess as a parentClass instead of the plain
 * BusinessProcess.
 */
public class MemberDetailsActions2 extends AbstractSimpleDecisionAction<OrderProcessModel> {
    private static final Logger LOG = Logger.getLogger(MemberDetailsActions2.class);


    @Override
    public Transition executeAction(OrderProcessModel orderProcessModel) {
        final boolean flag = true;

        if (flag) {
            LOG.info("Now we are in the MemberDetailsActions2 and the return status as OK and now we are moving to SUCCESS stage");
            return Transition.OK;
        } else {
            LOG.info("Now we are in the MemberDetailsActions2 and the return status as NOK return as ERROR message");
            return Transition.NOK;
        }
    }
}
