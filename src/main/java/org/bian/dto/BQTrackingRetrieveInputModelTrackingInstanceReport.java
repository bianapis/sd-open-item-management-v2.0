package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveInputModelTrackingInstanceReport
 */
public class BQTrackingRetrieveInputModelTrackingInstanceReport   {
  private String trackingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return trackingInstanceReportReference
  **/

  public String getTrackingInstanceReportReference() {
    return trackingInstanceReportReference;
  }

  public void setTrackingInstanceReportReference(String trackingInstanceReportReference) {
    this.trackingInstanceReportReference = trackingInstanceReportReference;
  }


}

