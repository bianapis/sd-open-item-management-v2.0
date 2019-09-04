package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingRetrieveInputModelTrackingInstanceAnalysis;
import org.bian.dto.BQTrackingRetrieveInputModelTrackingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveInputModel
 */
public class BQTrackingRetrieveInputModel   {
  private Object trackingRetrieveActionTaskRecord = null;

  private String trackingRetrieveActionRequest = null;

  private BQTrackingRetrieveInputModelTrackingInstanceReport trackingInstanceReport = null;

  private BQTrackingRetrieveInputModelTrackingInstanceAnalysis trackingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return trackingRetrieveActionRequest
  **/

  public String getTrackingRetrieveActionRequest() {
    return trackingRetrieveActionRequest;
  }

  public void setTrackingRetrieveActionRequest(String trackingRetrieveActionRequest) {
    this.trackingRetrieveActionRequest = trackingRetrieveActionRequest;
  }


  /**
   * Get trackingInstanceReport
   * @return trackingInstanceReport
  **/

  public BQTrackingRetrieveInputModelTrackingInstanceReport getTrackingInstanceReport() {
    return trackingInstanceReport;
  }

  public void setTrackingInstanceReport(BQTrackingRetrieveInputModelTrackingInstanceReport trackingInstanceReport) {
    this.trackingInstanceReport = trackingInstanceReport;
  }


  /**
   * Get trackingInstanceAnalysis
   * @return trackingInstanceAnalysis
  **/

  public BQTrackingRetrieveInputModelTrackingInstanceAnalysis getTrackingInstanceAnalysis() {
    return trackingInstanceAnalysis;
  }

  public void setTrackingInstanceAnalysis(BQTrackingRetrieveInputModelTrackingInstanceAnalysis trackingInstanceAnalysis) {
    this.trackingInstanceAnalysis = trackingInstanceAnalysis;
  }


}

