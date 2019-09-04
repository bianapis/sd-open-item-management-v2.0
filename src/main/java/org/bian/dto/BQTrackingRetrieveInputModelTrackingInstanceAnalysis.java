package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingRetrieveInputModelTrackingInstanceAnalysis
 */
public class BQTrackingRetrieveInputModelTrackingInstanceAnalysis   {
  private String trackingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return trackingInstanceAnalysisReference
  **/

  public String getTrackingInstanceAnalysisReference() {
    return trackingInstanceAnalysisReference;
  }

  public void setTrackingInstanceAnalysisReference(String trackingInstanceAnalysisReference) {
    this.trackingInstanceAnalysisReference = trackingInstanceAnalysisReference;
  }


}

