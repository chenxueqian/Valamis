package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFTincanManifestActLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LFTincanManifestActLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName200;
    private String[] _methodParameterTypes200;
    private String _methodName201;
    private String[] _methodParameterTypes201;
    private String _methodName206;
    private String[] _methodParameterTypes206;
    private String _methodName207;
    private String[] _methodParameterTypes207;
    private String _methodName208;
    private String[] _methodParameterTypes208;
    private String _methodName209;
    private String[] _methodParameterTypes209;

    public LFTincanManifestActLocalServiceClpInvoker() {
        _methodName0 = "addLFTincanManifestAct";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFTincanManifestAct"
            };

        _methodName1 = "createLFTincanManifestAct";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFTincanManifestAct";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFTincanManifestAct";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFTincanManifestAct"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchLFTincanManifestAct";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getLFTincanManifestAct";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getLFTincanManifestActs";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getLFTincanManifestActsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateLFTincanManifestAct";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFTincanManifestAct"
            };

        _methodName200 = "getBeanIdentifier";

        _methodParameterTypes200 = new String[] {  };

        _methodName201 = "setBeanIdentifier";

        _methodParameterTypes201 = new String[] { "java.lang.String" };

        _methodName206 = "removeAll";

        _methodParameterTypes206 = new String[] {  };

        _methodName207 = "createLFTincanManifestActivity";

        _methodParameterTypes207 = new String[] {  };

        _methodName208 = "findByPackageID";

        _methodParameterTypes208 = new String[] { "java.lang.Long" };

        _methodName209 = "findByTincanID";

        _methodParameterTypes209 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.addLFTincanManifestAct((com.arcusys.learn.persistence.liferay.model.LFTincanManifestAct) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.createLFTincanManifestAct(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.deleteLFTincanManifestAct(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.deleteLFTincanManifestAct((com.arcusys.learn.persistence.liferay.model.LFTincanManifestAct) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.fetchLFTincanManifestAct(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.getLFTincanManifestAct(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.getLFTincanManifestActs(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.getLFTincanManifestActsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.updateLFTincanManifestAct((com.arcusys.learn.persistence.liferay.model.LFTincanManifestAct) arguments[0]);
        }

        if (_methodName200.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName201.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
            LFTincanManifestActLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName206.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes206, parameterTypes)) {
            LFTincanManifestActLocalServiceUtil.removeAll();

            return null;
        }

        if (_methodName207.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes207, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.createLFTincanManifestActivity();
        }

        if (_methodName208.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes208, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.findByPackageID((java.lang.Long) arguments[0]);
        }

        if (_methodName209.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes209, parameterTypes)) {
            return LFTincanManifestActLocalServiceUtil.findByTincanID((java.lang.String) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
