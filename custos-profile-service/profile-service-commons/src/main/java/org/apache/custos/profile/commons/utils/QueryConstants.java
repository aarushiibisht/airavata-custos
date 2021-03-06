package org.apache.custos.profile.commons.utils;

import org.apache.custos.profile.model.user.UserProfile;
import org.apache.custos.profile.model.workspace.Gateway;

/**
 * Created by goshenoy on 03/08/2017.
 */
public class QueryConstants {


    public static final String FIND_USER_PROFILE_BY_USER_ID = "SELECT u FROM UserProfileEntity u " +
            "where u.userId LIKE :" + UserProfile._Fields.USER_ID.getFieldName() + " " +
            "AND u.gatewayId LIKE :" + UserProfile._Fields.GATEWAY_ID.getFieldName() + "";

    public static final String FIND_ALL_USER_PROFILES_BY_GATEWAY_ID = "SELECT u FROM UserProfileEntity u " +
            "where u.gatewayId LIKE :" + UserProfile._Fields.GATEWAY_ID.getFieldName() + "";

    public static final String FIND_GATEWAY_BY_INTERNAL_ID = "SELECT g FROM GatewayEntity g " +
            "where g.custosInternalGatewayId LIKE :" + Gateway._Fields.CUSTOS_INTERNAL_GATEWAY_ID.getFieldName();

    public static final String FIND_GATEWAY_BY_GATEWAY_ID = "SELECT g FROM GatewayEntity g " +
            "where g.gatewayId LIKE :" + Gateway._Fields.GATEWAY_ID.getFieldName();

    public static final String FIND_DUPLICATE_GATEWAY = "SELECT g FROM GatewayEntity g " +
            "where g.gatewayApprovalStatus IN :" + Gateway._Fields.GATEWAY_APPROVAL_STATUS.getFieldName() + " " +
            "and (g.gatewayId LIKE :" + Gateway._Fields.GATEWAY_ID.getFieldName() + " " +
            "     or g.gatewayName LIKE :" + Gateway._Fields.GATEWAY_NAME.getFieldName() + " " +
            "     or g.gatewayUrl LIKE :" + Gateway._Fields.GATEWAY_URL.getFieldName() + " " +
            "    )";

    public static final String GET_ALL_GATEWAYS = "SELECT g FROM GatewayEntity g";

    public static final String GET_USER_GATEWAYS = "SELECT g from GatewayEntity g " +
            "where g.requesterUsername LIKE :" + Gateway._Fields.REQUESTER_USERNAME.getFieldName() + "";
}
