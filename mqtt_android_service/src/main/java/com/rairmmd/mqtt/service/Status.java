package com.rairmmd.mqtt.service;

/**
 * 枚举 表示一个操作的成功或失败
 */
enum Status {
    /**
     * 表示操作成功
     */
    OK,

    /**
     * 表示操作失败
     */
    ERROR,

    /**
     * 表明操作的结果可能会异步返回
     */
    NO_RESULT
}
