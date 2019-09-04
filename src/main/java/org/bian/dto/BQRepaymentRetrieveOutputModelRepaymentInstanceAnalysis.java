package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelRepaymentInstanceAnalysis
 */
public class BQRepaymentRetrieveOutputModelRepaymentInstanceAnalysis   {
  private Object repaymentInstanceAnalysisRecord = null;

  private String repaymentInstanceAnalysisReportType = null;

  private String repaymentInstanceAnalysisParameters = null;

  private Object repaymentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return repaymentInstanceAnalysisRecord
  **/

  public Object getRepaymentInstanceAnalysisRecord() {
    return repaymentInstanceAnalysisRecord;
  }

  public void setRepaymentInstanceAnalysisRecord(Object repaymentInstanceAnalysisRecord) {
    this.repaymentInstanceAnalysisRecord = repaymentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return repaymentInstanceAnalysisReportType
  **/

  public String getRepaymentInstanceAnalysisReportType() {
    return repaymentInstanceAnalysisReportType;
  }

  public void setRepaymentInstanceAnalysisReportType(String repaymentInstanceAnalysisReportType) {
    this.repaymentInstanceAnalysisReportType = repaymentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return repaymentInstanceAnalysisParameters
  **/

  public String getRepaymentInstanceAnalysisParameters() {
    return repaymentInstanceAnalysisParameters;
  }

  public void setRepaymentInstanceAnalysisParameters(String repaymentInstanceAnalysisParameters) {
    this.repaymentInstanceAnalysisParameters = repaymentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return repaymentInstanceAnalysisReport
  **/

  public Object getRepaymentInstanceAnalysisReport() {
    return repaymentInstanceAnalysisReport;
  }

  public void setRepaymentInstanceAnalysisReport(Object repaymentInstanceAnalysisReport) {
    this.repaymentInstanceAnalysisReport = repaymentInstanceAnalysisReport;
  }


}

