/*
 * Java domain class for entity "SessionMaster" 
 * Created on 2022-08-24 ( Date ISO 2022-08-24 - Time 12:58:28 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2022-08-24 ( 12:58:28 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.math.BigDecimal;
import java.util.List;

import com.maan.eway.bean.SessionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.maan.eway.bean.SessionMasterId;
/**
 * <h2>SessionMasterRepository</h2>
 *
 * createdAt : 2022-08-24 - Time 12:58:28
 * <p>
 * Description: "SessionMaster" Repository
 */
 
 
 
public interface SessionMasterRepository  extends JpaRepository<SessionMaster,SessionMasterId > , JpaSpecificationExecutor<SessionMaster> {

	List<SessionMaster> findByLoginIdOrderByEntryDateDesc(String userId);

	SessionMaster findByTempTokenid(String authToken);

}
