## Docker ES instance
```
docker run -p 9200:9200 -p 9300:9300 -e "http.host=0.0.0.0" -e "transport.host=0.0.0.0" -e "cluster.name=jmen" -e "xpack.security.enabled=false" docker.elastic.co/elasticsearch/elasticsearch:5.4.0
```

## Stacktrace

```
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'booksRepository': Cannot resolve reference to bean 'elasticsearchTemplate' while setting bean property 'elasticsearchOperations'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'elasticsearchTemplate' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Unsatisfied dependency expressed through method 'elasticsearchTemplate' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'elasticsearchConverter' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Unsatisfied dependency expressed through method 'elasticsearchConverter' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mappingContext' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Post-processing of merged bean definition failed; nested exception is java.lang.NoClassDefFoundError: org/springframework/data/mapping/model/Property
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:359) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1531) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1276) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:553) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:742) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:867) ~[spring-context-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:543) ~[spring-context-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.4.RELEASE.jar:1.5.4.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.4.RELEASE.jar:1.5.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.4.RELEASE.jar:1.5.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.4.RELEASE.jar:1.5.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.4.RELEASE.jar:1.5.4.RELEASE]
	at com.example.demo.DemoApplication.main(DemoApplication.java:10) [classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_111]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_111]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_111]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_111]
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147) [idea_rt.jar:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'elasticsearchTemplate' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Unsatisfied dependency expressed through method 'elasticsearchTemplate' parameter 1; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'elasticsearchConverter' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Unsatisfied dependency expressed through method 'elasticsearchConverter' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mappingContext' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Post-processing of merged bean definition failed; nested exception is java.lang.NoClassDefFoundError: org/springframework/data/mapping/model/Property
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:749) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:467) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1173) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1067) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:513) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:351) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	... 23 common frames omitted
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'elasticsearchConverter' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Unsatisfied dependency expressed through method 'elasticsearchConverter' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mappingContext' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Post-processing of merged bean definition failed; nested exception is java.lang.NoClassDefFoundError: org/springframework/data/mapping/model/Property
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:749) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:467) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1173) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1067) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:513) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:208) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1138) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1066) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:835) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:741) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	... 33 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mappingContext' defined in class path resource [org/springframework/boot/autoconfigure/data/elasticsearch/ElasticsearchDataAutoConfiguration.class]: Post-processing of merged bean definition failed; nested exception is java.lang.NoClassDefFoundError: org/springframework/data/mapping/model/Property
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:526) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:208) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1138) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1066) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:835) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:741) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	... 47 common frames omitted
Caused by: java.lang.NoClassDefFoundError: org/springframework/data/mapping/model/Property
	at java.lang.Class.getDeclaredMethods0(Native Method) ~[na:1.8.0_111]
	at java.lang.Class.privateGetDeclaredMethods(Class.java:2701) ~[na:1.8.0_111]
	at java.lang.Class.getDeclaredMethods(Class.java:1975) ~[na:1.8.0_111]
	at org.springframework.util.ReflectionUtils.getDeclaredMethods(ReflectionUtils.java:613) ~[spring-core-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.util.ReflectionUtils.doWithLocalMethods(ReflectionUtils.java:489) ~[spring-core-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.buildLifecycleMetadata(InitDestroyAnnotationBeanPostProcessor.java:206) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.findLifecycleMetadata(InitDestroyAnnotationBeanPostProcessor.java:187) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor.postProcessMergedBeanDefinition(InitDestroyAnnotationBeanPostProcessor.java:125) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.context.annotation.CommonAnnotationBeanPostProcessor.postProcessMergedBeanDefinition(CommonAnnotationBeanPostProcessor.java:295) ~[spring-context-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyMergedBeanDefinitionPostProcessors(AbstractAutowireCapableBeanFactory.java:992) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-4.3.9.RELEASE.jar:4.3.9.RELEASE]
	... 57 common frames omitted
Caused by: java.lang.ClassNotFoundException: org.springframework.data.mapping.model.Property
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381) ~[na:1.8.0_111]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424) ~[na:1.8.0_111]
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331) ~[na:1.8.0_111]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357) ~[na:1.8.0_111]
	... 68 common frames omitted
```
