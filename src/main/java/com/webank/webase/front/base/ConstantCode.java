package com.webank.webase.front.base;

/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Code Constant.
 * 
 */
public interface ConstantCode {

    /* return success */
    RetCode RET_SUCCEED = RetCode.mark(0, "success");

    /* paramaters check */
    String PARAM_FAIL_UUID_IS_EMPTY = "{\"code\":201001,\"msg\":\"uuid cannot be empty\"}";
    String PARAM_FAIL_USERID_IS_EMPTY = "{\"code\":201002,\"msg\":\"userId cannot be empty\"}";
    String PARAM_FAIL_CONTRACTNAME_IS_EMPTY =
            "{\"code\":201003,\"msg\":\"contractName cannot be empty\"}";
    String PARAM_FAIL_VERSION_IS_EMPTY = "{\"code\":201004,\"msg\":\"version cannot be empty\"}";
    String PARAM_FAIL_FUNCNAME_IS_EMPTY = "{\"code\":201005,\"msg\":\"funcName cannot be empty\"}";
    String PARAM_FAIL_ABIINFO_IS_EMPTY = "{\"code\":201006,\"msg\":\"abiInfo cannot be empty\"}";
    String PARAM_FAIL_CONTRACTBIN_IS_EMPTY =
            "{\"code\":201007,\"msg\":\"contractBin cannot be empty\"}";

    /* general error */
    RetCode CONTRACT_DEPLOYED_ERROR =
            RetCode.mark(201008, "contract's current version has been deployed");
    RetCode CONTRACT_NOT_DEPLOY_ERROR = RetCode.mark(201009, "contract is not deployed");
    RetCode ABI_SAVE_ERROR = RetCode.mark(201010, "save abi error");
    RetCode IN_FUNCPARAM_ERROR = RetCode.mark(201011, "contract funcParam is error");
    RetCode BLOCK_NUMBER_ERROR = RetCode.mark(201012, "requst blockNumber is greater than latest");
    RetCode ABI_GET_ERROR = RetCode.mark(201013, "get abi from chain error");
    RetCode CONTRACT_DEPLOY_ERROR = RetCode.mark(201014, "contract deploy error");
    RetCode PRIVATEKEY_IS_NULL = RetCode.mark(201015, "user's privateKey is null");
    RetCode FILE_IS_NOT_EXIST = RetCode.mark(201016, "file is not exist");
    RetCode GET_NODE_CONFIG_FAILE = RetCode.mark(201017, "failed to get node config");
    RetCode BLOCKNUMBER_AND_PBFTVIEW_UNCHANGED =
            RetCode.mark(201018, "blockNumber and pbftView unchanged");
    RetCode IN_FUNCTION_ERROR = RetCode.mark(201019, "request function is error");
    RetCode TRANSACTION_QUERY_FAILED = RetCode.mark(201020, "transaction query from chain failed");
    RetCode TRANSACTION_SEND_FAILED = RetCode.mark(201021, "transaction send to chain failed");
    RetCode NODE_REQUEST_FAILED = RetCode.mark(201022, "node request failed");

    /* system error */
    RetCode SYSTEM_ERROR = RetCode.mark(101001, "system error");
    RetCode PARAM_VAILD_FAIL = RetCode.mark(101002, "param valid fail");
}
