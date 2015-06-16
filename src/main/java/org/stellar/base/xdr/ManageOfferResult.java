// Automatically generated on 2015-06-16T15:35:11-07:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union ManageOfferResult switch (ManageOfferResultCode code)
//  {
//  case MANAGE_OFFER_SUCCESS:
//      ManageOfferSuccessResult success;
//  default:
//      void;
//  };

//  ===========================================================================
public class ManageOfferResult  {
  public ManageOfferResult () {}
  ManageOfferResultCode code;
  public ManageOfferResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(ManageOfferResultCode value) {
    this.code = value;
  }
  private ManageOfferSuccessResult success;
  public ManageOfferSuccessResult getsuccess() {
    return this.success;
  }
  public void setsuccess(ManageOfferSuccessResult value) {
    this.success = value;
  }
  public static void encode(XdrDataOutputStream stream, ManageOfferResult encodedManageOfferResult) throws IOException {
    switch (encodedManageOfferResult.getDiscriminant()) {
  case MANAGE_OFFER_SUCCESS:
  ManageOfferSuccessResult.encode(stream, encodedManageOfferResult.success);
  break;
  default:
  break;
  }
  }
  public static ManageOfferResult decode(XdrDataInputStream stream) throws IOException {
    ManageOfferResult decodedManageOfferResult = new ManageOfferResult();
    switch (decodedManageOfferResult.getDiscriminant()) {
  case MANAGE_OFFER_SUCCESS:
  decodedManageOfferResult.success = ManageOfferSuccessResult.decode(stream);
  break;
  default:
  break;
  }
    return decodedManageOfferResult;
  }
}
