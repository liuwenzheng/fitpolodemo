package com.fitpolo.support.task;

import com.fitpolo.support.FitConstant;
import com.fitpolo.support.OrderEnum;
import com.fitpolo.support.callback.OrderCallback;
import com.fitpolo.support.entity.BaseResponse;

/**
 * @Date 2017/5/11
 * @Author wenzheng.liu
 * @Description 获取睡眠记录
 * @ClassPath com.fitpolo.support.task.DailySleepRecordTask
 */
public class DailySleepRecordTask extends OrderTask {

    public DailySleepRecordTask(OrderCallback callback) {
        setOrder(OrderEnum.getDailySleepRecord);
        setCallback(callback);
        setResponse(new BaseResponse());
    }

    @Override
    public byte[] assemble(Object... objects) {
        byte[] byteArray = new byte[2];
        byteArray[0] = (byte) FitConstant.HEADER_GETDATA;
        byteArray[1] = (byte) FitConstant.GET_DAILY_SLEEP_RECORD;
        return byteArray;
    }
}
