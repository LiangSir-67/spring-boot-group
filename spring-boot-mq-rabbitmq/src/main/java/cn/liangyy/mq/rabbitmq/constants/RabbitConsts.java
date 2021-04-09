package cn.liangyy.mq.rabbitmq.constants;

/**
 * RabbitMQ常量池
 *
 * 路由键 1 和路由键 2 分别为 queue.# 和 *.queue，
 * 而队列 2 和队列 3 分别为 queue.2 和 3.queue 并将其作为组件添加进 Spring Boot 项目的时候，
 * 对应的路由和队列就会进行匹配。
 *
 * @Author: 梁歪歪 <1732178815@qq.com>
 * @Description: blog <liangyy.cn>
 * @Create 2021-04-09-10:53
 */
public interface RabbitConsts {
    /**
     * 直接模式1
     */
    String DIRECT_MODE_QUEUE_ONE = "queue.direct.1";

    /**
     * 队列2
     */
    String QUEUE_TWO = "queue.2";

    /**
     * 队列3
     */
    String QUEUE_THREE = "3.queue";

    /**
     * 分列模式
     */
    String FANOUT_MODE_QUEUE = "fanout.mode";

    /**
     * 主题模式
     */
    String TOPIC_MODE_QUEUE = "topic.mode";

    /**
     * 路由1
     */
    String TOPIC_ROUTING_KEY_ONE = "queue.#";

    /**
     * 路由2
     */
    String TOPIC_ROUTING_KEY_TWO = "*.queue";

    /**
     * 路由3
     */
    String TOPIC_ROUTING_KEY_THREE = "3.queue";

}
