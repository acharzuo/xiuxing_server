package com.xiuxing.sample.scope;

/**
 * Created by Administrator on 2017/5/19.
 */

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DemoPrototypeService {
}
