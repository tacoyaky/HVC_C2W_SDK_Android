# HVC-C2W Android-SDK by OMRON

### 1. SDK内容
  Android端末からオムロン製HVC-C2Wを制御するためのSDK(α版)を提供します。
  
### 2. ご利用方法
  本SDKをご利用頂くには、SensingEggProjectメンバーサイトへの
  メンバー登録（無料）が必要です。
  http://plus-sensing.omron.co.jp/member/sdk/

  また、WebAPIを使用してサーバにアクセスするためにはAppIDとApiKeyが必要となります。
  いずれも「APIキー申請フォーム」よりご申請下さい。

  
### 3. ディレクトリ構成
      doc/
         HVC-C2W_WebAPI仕様書      HVC-C2Wを使用する為のクラウドサーバWebAPI仕様書
         HVC-C2W_API仕様書         HVC-C2Wを制御する為のAPI仕様書
      bin/
         jar/                      jarファイル格納フォルダ
         native/                   HVC-C2W SDKバイナリファイル本体
      src/
         HVCW_JNI/                 JNIソースコード
         java/                     javaソースコード
         src/usr_include/
            HvcwSdkAPI.h           SDKヘッダファイル
            HvcwTypedef.h          TypeDef定義
            HvcwCommonDef.h        エラーコード定義


###[ご使用にあたって]
* 本ソースコード、バイナリファイルおよびドキュメントの著作権はオムロンに帰属します。
* 本ソースコード及びバイナリファイルは動作を保証するものではありません。

----
オムロン株式会社  
Copyright(C) 2015 OMRON Corporation, All Rights Reserved.
