package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
* The base model interface for the LFTincanLrsResult service. Represents a row in the &quot;Learn_LFTincanLrsResult&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsResultModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsResultImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFTincanLrsResult
* @see com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsResultImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFTincanLrsResultModelImpl
* @generated
*/
public interface LFTincanLrsResultModel extends BaseModel<LFTincanLrsResult> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f tincan lrs result model instance should use the {@link LFTincanLrsResult} interface instead.
    */

    /**
    * Returns the primary key of this l f tincan lrs result.
    *
    * @return the primary key of this l f tincan lrs result
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f tincan lrs result.
    *
    * @param primaryKey the primary key of this l f tincan lrs result
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f tincan lrs result.
    *
    * @return the ID of this l f tincan lrs result
    */
    public long getId();

    /**
        * Sets the ID of this l f tincan lrs result.
    *
    * @param id the ID of this l f tincan lrs result
    */
    public void setId(long id);

    /**
    * Returns the score of this l f tincan lrs result.
    *
    * @return the score of this l f tincan lrs result
    */
    @AutoEscape
    public String getScore();

    /**
        * Sets the score of this l f tincan lrs result.
    *
    * @param score the score of this l f tincan lrs result
    */
    public void setScore(String score);

    /**
    * Returns the success of this l f tincan lrs result.
    *
    * @return the success of this l f tincan lrs result
    */
    public Boolean getSuccess();

    /**
        * Sets the success of this l f tincan lrs result.
    *
    * @param success the success of this l f tincan lrs result
    */
    public void setSuccess(Boolean success);

    /**
    * Returns the completion of this l f tincan lrs result.
    *
    * @return the completion of this l f tincan lrs result
    */
    public Boolean getCompletion();

    /**
        * Sets the completion of this l f tincan lrs result.
    *
    * @param completion the completion of this l f tincan lrs result
    */
    public void setCompletion(Boolean completion);

    /**
    * Returns the response of this l f tincan lrs result.
    *
    * @return the response of this l f tincan lrs result
    */
    @AutoEscape
    public String getResponse();

    /**
        * Sets the response of this l f tincan lrs result.
    *
    * @param response the response of this l f tincan lrs result
    */
    public void setResponse(String response);

    /**
    * Returns the duration of this l f tincan lrs result.
    *
    * @return the duration of this l f tincan lrs result
    */
    public Double getDuration();

    /**
        * Sets the duration of this l f tincan lrs result.
    *
    * @param duration the duration of this l f tincan lrs result
    */
    public void setDuration(Double duration);

    /**
    * Returns the extension of this l f tincan lrs result.
    *
    * @return the extension of this l f tincan lrs result
    */
    @AutoEscape
    public String getExtension();

    /**
        * Sets the extension of this l f tincan lrs result.
    *
    * @param extension the extension of this l f tincan lrs result
    */
    public void setExtension(String extension);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(LFTincanLrsResult lfTincanLrsResult);

    public int hashCode();

    public CacheModel<LFTincanLrsResult> toCacheModel();

    public LFTincanLrsResult toEscapedModel();

    public String toString();

    public String toXmlString();
}