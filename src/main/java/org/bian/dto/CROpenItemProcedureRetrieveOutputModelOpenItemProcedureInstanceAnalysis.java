package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceAnalysis
 */
public class CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceAnalysis   {
  private String openItemProcedureInstanceAnalysisData = null;

  private String openItemProcedureInstanceAnalysisReportType = null;

  private Object openItemProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return openItemProcedureInstanceAnalysisData
  **/

  public String getOpenItemProcedureInstanceAnalysisData() {
    return openItemProcedureInstanceAnalysisData;
  }

  public void setOpenItemProcedureInstanceAnalysisData(String openItemProcedureInstanceAnalysisData) {
    this.openItemProcedureInstanceAnalysisData = openItemProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return openItemProcedureInstanceAnalysisReportType
  **/

  public String getOpenItemProcedureInstanceAnalysisReportType() {
    return openItemProcedureInstanceAnalysisReportType;
  }

  public void setOpenItemProcedureInstanceAnalysisReportType(String openItemProcedureInstanceAnalysisReportType) {
    this.openItemProcedureInstanceAnalysisReportType = openItemProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return openItemProcedureInstanceAnalysisReport
  **/

  public Object getOpenItemProcedureInstanceAnalysisReport() {
    return openItemProcedureInstanceAnalysisReport;
  }

  public void setOpenItemProcedureInstanceAnalysisReport(Object openItemProcedureInstanceAnalysisReport) {
    this.openItemProcedureInstanceAnalysisReport = openItemProcedureInstanceAnalysisReport;
  }


}

