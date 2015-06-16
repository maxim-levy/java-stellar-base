// Automatically generated on 2015-06-16T15:35:11-07:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  typedef opaque Hash[32];

//  ===========================================================================
public class Hash  {
  private byte[] Hash;
  public byte[] getHash() {
    return this.Hash;
  }
  public void setHash(byte[] value) {
    this.Hash = value;
  }
  public static void encode(XdrDataOutputStream stream, Hash  encodedHash) throws IOException {
  int Hashsize = encodedHash.Hash.length;
  stream.write(encodedHash.getHash(), 0, Hashsize);
  }
  public static Hash decode(XdrDataInputStream stream) throws IOException {
    Hash decodedHash = new Hash();
  int Hashsize = 32;
  decodedHash.Hash = new byte[Hashsize];
  stream.read(decodedHash.Hash, 0, Hashsize);
    return decodedHash;
  }
}
