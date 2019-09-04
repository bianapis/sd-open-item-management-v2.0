package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingRetrieveOutputModelTrackingInstanceAnalysis;
import org.bian.dto.BQTrackingRetrieveOutputModelTrackingInstanceRecord;
import org.bian.dto.BQTrackingRetrieveOutputModelTrackingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveOutputModel
 */
public class BQTrackingRetrieveOutputModel   {
  private BQTrackingRetrieveOutputModelTrackingInstanceRecord trackingInstanceRecord = null;

  private String trackingRetrieveActionTaskReference = null;

  private Object trackingRetrieveActionTaskRecord = null;

  private String trackingRetrieveActionResponse = null;

  private BQTrackingRetrieveOutputModelTrackingInstanceReport trackingInstanceReport = null;

  private BQTrackingRetrieveOutputModelTrackingInstanceAnalysis trackingInstanceAnalysis = null;


  /**
   * Get trackingInstanceRecord
   * @return trackingInstanceRecord
  **/

  public BQTrackingRetrieveOutputModelTrackingInstanceRecord getTrackingInstanceRecord() {
    return trackingInstanceRecord;
  }

  public void setTrackingInstanceRecord(BQTrackingRetrieveOutputModelTrackingInstanceRecord trackingInstanceRecord) {
    this.trackingInstanceRecord = trackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tracking instance retrieve service call 
   * @return trackingRetrieveActionTaskReference
  **/

  public String getTrackingRetrieveActionTaskReference() {
    return trackingRetrieveActionTaskReference;
  }

  public void setTrackingRetrieveActionTaskReference(String trackingRetrieveActionTaskReference) {
    this.trackingRetrieveActionTaskReference = trackingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trackingRetrieveActionTaskRecord
  **/

  public Object getTrackingRetrieveActionTaskRecord() {
    return trackingRetrieveActionTaskRecord;
  }

  public void setTrackingRetrieveActionTaskRecord(Object trackingRetrieveActionTaskRecord) {
    this.trackingRetrieveActionTaskRecord = trackingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return trackingRetrieveActionResponse
  **/

  public String getTrackingRetrieveActionResponse() {
    return trackingRetrieveActionResponse;
  }

  public void setTrackingRetrieveActionResponse(String trackingRetrieveActionResponse) {
    this.trackingRetrieveActionResponse = trackingRetrieveActionResponse;
  }


  /**
   * Get trackingInstanceReport
   * @return trackingInstanceReport
  **/

  public BQTrackingRetrieveOutputModelTrackingInstanceReport getTrackingInstanceReport() {
    return trackingInstanceReport;
  }

  public void setTrackingInstanceReport(BQTrackingRetrieveOutputModelTrackingInstanceReport trackingInstanceReport) {
    this.trackingInstanceReport = trackingInstanceReport;
  }


  /**
   * Get trackingInstanceAnalysis
   * @return trackingInstanceAnalysis
  **/

  public BQTrackingRetrieveOutputModelTrackingInstanceAnalysis getTrackingInstanceAnalysis() {
    return trackingInstanceAnalysis;
  }

  public void setTrackingInstanceAnalysis(BQTrackingRetrieveOutputModelTrackingInstanceAnalysis trackingInstanceAnalysis) {
    this.trackingInstanceAnalysis = trackingInstanceAnalysis;
  }


}

