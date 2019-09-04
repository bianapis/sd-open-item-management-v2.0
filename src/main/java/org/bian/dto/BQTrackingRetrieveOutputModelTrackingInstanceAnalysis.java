package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveOutputModelTrackingInstanceAnalysis
 */
public class BQTrackingRetrieveOutputModelTrackingInstanceAnalysis   {
  private Object trackingInstanceAnalysisRecord = null;

  private String trackingInstanceAnalysisReportType = null;

  private String trackingInstanceAnalysisParameters = null;

  private Object trackingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return trackingInstanceAnalysisRecord
  **/

  public Object getTrackingInstanceAnalysisRecord() {
    return trackingInstanceAnalysisRecord;
  }

  public void setTrackingInstanceAnalysisRecord(Object trackingInstanceAnalysisRecord) {
    this.trackingInstanceAnalysisRecord = trackingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return trackingInstanceAnalysisReportType
  **/

  public String getTrackingInstanceAnalysisReportType() {
    return trackingInstanceAnalysisReportType;
  }

  public void setTrackingInstanceAnalysisReportType(String trackingInstanceAnalysisReportType) {
    this.trackingInstanceAnalysisReportType = trackingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return trackingInstanceAnalysisParameters
  **/

  public String getTrackingInstanceAnalysisParameters() {
    return trackingInstanceAnalysisParameters;
  }

  public void setTrackingInstanceAnalysisParameters(String trackingInstanceAnalysisParameters) {
    this.trackingInstanceAnalysisParameters = trackingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return trackingInstanceAnalysisReport
  **/

  public Object getTrackingInstanceAnalysisReport() {
    return trackingInstanceAnalysisReport;
  }

  public void setTrackingInstanceAnalysisReport(Object trackingInstanceAnalysisReport) {
    this.trackingInstanceAnalysisReport = trackingInstanceAnalysisReport;
  }


}

