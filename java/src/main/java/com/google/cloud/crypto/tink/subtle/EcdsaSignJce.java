// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
////////////////////////////////////////////////////////////////////////////////

package com.google.cloud.crypto.tink.subtle;

import com.google.cloud.crypto.tink.PublicKeySign;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/**
 * Ecdsa signature's signing in JCE.
 */
public final class EcdsaSignJce implements PublicKeySign {
  private final ECPrivateKey privateKey;
  private final String signatureAlgorithm;

  public EcdsaSignJce(final ECPrivateKey priv, String signatureAlgorithm) {
    this.privateKey = priv;
    this.signatureAlgorithm = signatureAlgorithm;
  }

  @Override
  public byte[] sign(final byte[] data) throws GeneralSecurityException {
    Signature signer = EngineFactory.SIGNATURE.getInstance(signatureAlgorithm);
    signer.initSign(privateKey);
    signer.update(data);
    return signer.sign();
  }
}
