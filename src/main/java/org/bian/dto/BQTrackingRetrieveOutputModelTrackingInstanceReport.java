package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveOutputModelTrackingInstanceReport
 */
public class BQTrackingRetrieveOutputModelTrackingInstanceReport   {
  private Object trackingInstanceReportRecord = null;

  private String trackingInstanceReportType = null;

  private String trackingInstanceReportParameters = null;

  private Object trackingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return trackingInstanceReportRecord
  **/

  public Object getTrackingInstanceReportRecord() {
    return trackingInstanceReportRecord;
  }

  public void setTrackingInstanceReportRecord(Object trackingInstanceReportRecord) {
    this.trackingInstanceReportRecord = trackingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return trackingInstanceReportType
  **/

  public String getTrackingInstanceReportType() {
    return trackingInstanceReportType;
  }

  public void setTrackingInstanceReportType(String trackingInstanceReportType) {
    this.trackingInstanceReportType = trackingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return trackingInstanceReportParameters
  **/

  public String getTrackingInstanceReportParameters() {
    return trackingInstanceReportParameters;
  }

  public void setTrackingInstanceReportParameters(String trackingInstanceReportParameters) {
    this.trackingInstanceReportParameters = trackingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return trackingInstanceReport
  **/

  public Object getTrackingInstanceReport() {
    return trackingInstanceReport;
  }

  public void setTrackingInstanceReport(Object trackingInstanceReport) {
    this.trackingInstanceReport = trackingInstanceReport;
  }


}

