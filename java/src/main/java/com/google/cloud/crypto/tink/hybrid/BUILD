licenses(["notice"])  # Apache 2.0

package(
    default_visibility = [
        "//java:__subpackages__",
    ],
)

JAVACOPTS = [
    "-Xlint:unchecked",
    "-Xlint:deprecation",
]

filegroup(
    name = "encrypt_srcs",
    srcs = [
        "EciesAeadHkdfAeadFactory.java",
        "EciesAeadHkdfHybridEncrypt.java",
        "EciesAeadHkdfPublicKeyManager.java",
        "HybridEncryptFactory.java",
        "HybridUtil.java",
    ],
)

java_library(
    name = "encrypt",
    srcs = [
        ":encrypt_srcs",
    ],
    javacopts = JAVACOPTS,
    deps = [
        "//java/src/main/java/com/google/cloud/crypto/tink",
        "//java/src/main/java/com/google/cloud/crypto/tink/aead",
        "//java/src/main/java/com/google/cloud/crypto/tink/mac",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle:hybrid",
        "//proto:aes_ctr_hmac_aead_java_proto",
        "//proto:aes_gcm_java_proto",
        "//proto:common_java_proto",
        "//proto:ecies_aead_hkdf_java_proto",
        "//proto:hmac_java_proto",
        "//proto:tink_java_proto",
        "//proto:tink_java_proto_compile_imports",
    ],
)

java_library(
    name = "encrypt_android",
    srcs = [
        ":encrypt_srcs",
    ],
    javacopts = JAVACOPTS,
    deps = [
        "//java/src/main/java/com/google/cloud/crypto/tink:android",
        "//java/src/main/java/com/google/cloud/crypto/tink/aead:android",
        "//java/src/main/java/com/google/cloud/crypto/tink/mac:android",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle:hybrid",
        "//proto:aes_ctr_hmac_aead_java_proto_lite",
        "//proto:aes_gcm_java_proto_lite",
        "//proto:common_java_proto_lite",
        "//proto:ecies_aead_hkdf_java_proto_lite",
        "//proto:hmac_java_proto_lite",
        "//proto:tink_java_proto_lite",
        "//proto:tink_java_proto_lite_compile_imports",
    ],
)

filegroup(
    name = "decrypt_srcs",
    srcs = [
        "EciesAeadHkdfAeadFactory.java",
        "EciesAeadHkdfHybridDecrypt.java",
        "EciesAeadHkdfPrivateKeyManager.java",
        "HybridDecryptFactory.java",
        "HybridUtil.java",
    ],
)

java_library(
    name = "decrypt",
    srcs = [
        ":decrypt_srcs",
    ],
    javacopts = JAVACOPTS,
    deps = [
        "//java/src/main/java/com/google/cloud/crypto/tink",
        "//java/src/main/java/com/google/cloud/crypto/tink/aead",
        "//java/src/main/java/com/google/cloud/crypto/tink/mac",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle:hybrid",
        "//proto:aes_ctr_hmac_aead_java_proto",
        "//proto:aes_gcm_java_proto",
        "//proto:common_java_proto",
        "//proto:ecies_aead_hkdf_java_proto",
        "//proto:hmac_java_proto",
        "//proto:tink_java_proto",
        "//proto:tink_java_proto_compile_imports",
    ],
)

java_library(
    name = "decrypt_android",
    srcs = [
        ":decrypt_srcs",
    ],
    javacopts = JAVACOPTS,
    deps = [
        "//java/src/main/java/com/google/cloud/crypto/tink:android",
        "//java/src/main/java/com/google/cloud/crypto/tink/aead:android",
        "//java/src/main/java/com/google/cloud/crypto/tink/mac:android",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle",
        "//java/src/main/java/com/google/cloud/crypto/tink/subtle:hybrid",
        "//proto:aes_ctr_hmac_aead_java_proto_lite",
        "//proto:aes_gcm_java_proto_lite",
        "//proto:common_java_proto_lite",
        "//proto:ecies_aead_hkdf_java_proto_lite",
        "//proto:hmac_java_proto_lite",
        "//proto:tink_java_proto_lite",
        "//proto:tink_java_proto_lite_compile_imports",
    ],
)
