/*
 * Created on 2022-11-21 ( 15:20:31 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "SessionMaster" ( stored in table "session_master" )
 *
 * @author Telosys
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class SessionMasterId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     loginId ;
    
    private String     tempTokenid ;
    
     
}
