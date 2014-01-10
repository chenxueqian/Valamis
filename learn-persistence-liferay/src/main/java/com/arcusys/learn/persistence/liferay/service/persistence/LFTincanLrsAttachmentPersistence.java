package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l f tincan lrs attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanLrsAttachmentPersistenceImpl
 * @see LFTincanLrsAttachmentUtil
 * @generated
 */
public interface LFTincanLrsAttachmentPersistence extends BasePersistence<LFTincanLrsAttachment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LFTincanLrsAttachmentUtil} to access the l f tincan lrs attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the l f tincan lrs attachment in the entity cache if it is enabled.
    *
    * @param lfTincanLrsAttachment the l f tincan lrs attachment
    */
    public void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment lfTincanLrsAttachment);

    /**
    * Caches the l f tincan lrs attachments in the entity cache if it is enabled.
    *
    * @param lfTincanLrsAttachments the l f tincan lrs attachments
    */
    public void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> lfTincanLrsAttachments);

    /**
    * Creates a new l f tincan lrs attachment with the primary key. Does not add the l f tincan lrs attachment to the database.
    *
    * @param id the primary key for the new l f tincan lrs attachment
    * @return the new l f tincan lrs attachment
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment create(
        long id);

    /**
    * Removes the l f tincan lrs attachment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan lrs attachment
    * @return the l f tincan lrs attachment that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException if a l f tincan lrs attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment lfTincanLrsAttachment,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs attachment with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException} if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs attachment
    * @return the l f tincan lrs attachment
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException if a l f tincan lrs attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs attachment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f tincan lrs attachment
    * @return the l f tincan lrs attachment, or <code>null</code> if a l f tincan lrs attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f tincan lrs attachments where parentID = &#63;.
    *
    * @param parentID the parent i d
    * @return the matching l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> findByParentID(
        java.lang.Integer parentID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs attachments where parentID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentID the parent i d
    * @param start the lower bound of the range of l f tincan lrs attachments
    * @param end the upper bound of the range of l f tincan lrs attachments (not inclusive)
    * @return the range of matching l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> findByParentID(
        java.lang.Integer parentID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f tincan lrs attachments where parentID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentID the parent i d
    * @param start the lower bound of the range of l f tincan lrs attachments
    * @param end the upper bound of the range of l f tincan lrs attachments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> findByParentID(
        java.lang.Integer parentID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f tincan lrs attachment in the ordered set where parentID = &#63;.
    *
    * @param parentID the parent i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan lrs attachment
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException if a matching l f tincan lrs attachment could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment findByParentID_First(
        java.lang.Integer parentID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first l f tincan lrs attachment in the ordered set where parentID = &#63;.
    *
    * @param parentID the parent i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan lrs attachment, or <code>null</code> if a matching l f tincan lrs attachment could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment fetchByParentID_First(
        java.lang.Integer parentID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f tincan lrs attachment in the ordered set where parentID = &#63;.
    *
    * @param parentID the parent i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan lrs attachment
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException if a matching l f tincan lrs attachment could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment findByParentID_Last(
        java.lang.Integer parentID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last l f tincan lrs attachment in the ordered set where parentID = &#63;.
    *
    * @param parentID the parent i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan lrs attachment, or <code>null</code> if a matching l f tincan lrs attachment could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment fetchByParentID_Last(
        java.lang.Integer parentID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the l f tincan lrs attachments before and after the current l f tincan lrs attachment in the ordered set where parentID = &#63;.
    *
    * @param id the primary key of the current l f tincan lrs attachment
    * @param parentID the parent i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f tincan lrs attachment
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException if a l f tincan lrs attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment[] findByParentID_PrevAndNext(
        long id, java.lang.Integer parentID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanLrsAttachmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the l f tincan lrs attachments.
    *
    * @return the l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the l f tincan lrs attachments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs attachments
    * @param end the upper bound of the range of l f tincan lrs attachments (not inclusive)
    * @return the range of l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the l f tincan lrs attachments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan lrs attachments
    * @param end the upper bound of the range of l f tincan lrs attachments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanLrsAttachment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f tincan lrs attachments where parentID = &#63; from the database.
    *
    * @param parentID the parent i d
    * @throws SystemException if a system exception occurred
    */
    public void removeByParentID(java.lang.Integer parentID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the l f tincan lrs attachments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs attachments where parentID = &#63;.
    *
    * @param parentID the parent i d
    * @return the number of matching l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public int countByParentID(java.lang.Integer parentID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of l f tincan lrs attachments.
    *
    * @return the number of l f tincan lrs attachments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}