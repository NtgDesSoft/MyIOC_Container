package ioc

import kotlin.reflect.KClass

data class ServiceDescriptor(
    var implementation: Any?,
    var implementationType: KClass<*>?,
    var lifetime: ServiceLifetime,
    var clazz: KClass<*>? = implementation?.let { it::class }
) {
    /**
     * The data class that is helping by storing information about objects
     *
     * implementation - The actual implementation class
     * implementationType
     * lifetime - Whether to store as Singleton as Transient
     * clazz - The actual implementation
     *
     */
}