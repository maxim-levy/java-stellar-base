// Automatically generated on 2015-06-16T15:35:11-07:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union SetOptionsResult switch (SetOptionsResultCode code)
//  {
//  case SET_OPTIONS_SUCCESS:
//      void;
//  default:
//      void;
//  };

//  ===========================================================================
public class SetOptionsResult  {
  public SetOptionsResult () {}
  SetOptionsResultCode code;
  public SetOptionsResultCode getDiscriminant() {
    return this.code;
  }
  public void setDiscriminant(SetOptionsResultCode value) {
    this.code = value;
  }
  public static void encode(XdrDataOutputStream stream, SetOptionsResult encodedSetOptionsResult) throws IOException {
    switch (encodedSetOptionsResult.getDiscriminant()) {
  case SET_OPTIONS_SUCCESS:
  break;
  default:
  break;
  }
  }
  public static SetOptionsResult decode(XdrDataInputStream stream) throws IOException {
    SetOptionsResult decodedSetOptionsResult = new SetOptionsResult();
    switch (decodedSetOptionsResult.getDiscriminant()) {
  case SET_OPTIONS_SUCCESS:
  break;
  default:
  break;
  }
    return decodedSetOptionsResult;
  }
}
