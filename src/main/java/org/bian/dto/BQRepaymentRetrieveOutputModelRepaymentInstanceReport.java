package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelRepaymentInstanceReport
 */
public class BQRepaymentRetrieveOutputModelRepaymentInstanceReport   {
  private Object repaymentInstanceReportRecord = null;

  private String repaymentInstanceReportType = null;

  private String repaymentInstanceReportParameters = null;

  private Object repaymentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return repaymentInstanceReportRecord
  **/

  public Object getRepaymentInstanceReportRecord() {
    return repaymentInstanceReportRecord;
  }

  public void setRepaymentInstanceReportRecord(Object repaymentInstanceReportRecord) {
    this.repaymentInstanceReportRecord = repaymentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return repaymentInstanceReportType
  **/

  public String getRepaymentInstanceReportType() {
    return repaymentInstanceReportType;
  }

  public void setRepaymentInstanceReportType(String repaymentInstanceReportType) {
    this.repaymentInstanceReportType = repaymentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return repaymentInstanceReportParameters
  **/

  public String getRepaymentInstanceReportParameters() {
    return repaymentInstanceReportParameters;
  }

  public void setRepaymentInstanceReportParameters(String repaymentInstanceReportParameters) {
    this.repaymentInstanceReportParameters = repaymentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return repaymentInstanceReport
  **/

  public Object getRepaymentInstanceReport() {
    return repaymentInstanceReport;
  }

  public void setRepaymentInstanceReport(Object repaymentInstanceReport) {
    this.repaymentInstanceReport = repaymentInstanceReport;
  }


}

