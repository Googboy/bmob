今天做的主要是bomb后端云小功能模块，主要实现了云端数据的同步操作，直接将数据上传到云端服务器，给开发人员带来很大的便利。
其中遇到的主要问题有：
①：Error:(46, 27) 错误: 无法访问Subscription 找不到rx.Subscription的类文件：原因是缺少jar包
②：Bmob:java.lang.UnsatisfiedLinkError: Couldn't load bmob: findLibrary returned null：原因是缺少BmobSDK包中的so文件
③：java.lang.UnsatisfiedLinkError: Native method not found: cn.bmob.v3.helper.BmobNative.init:(Landroid/content/Context;Ljava/lang/String;)Z:原因是build grade缺少配置属性
④：Error:Execution failed for task ':app:transformClassesWithDexForDebug'.原因是jar包重复，删除Libs下的jar包就可以
