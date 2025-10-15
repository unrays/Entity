// Copyright (c) October 2025 Félix-Olivier Dumas. All rights reserved.
// Licensed under the terms described in the LICENSE file

package com.ECS.ecs;

import com.ECS.components.Component;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private final Map<Entity, Map<Class<? extends Component>, Component>> registry = new HashMap<>();

    public <T extends Component> void addComponent(Entity e, T... components) {
        for (T c : components) registry.computeIfAbsent(e, key -> new HashMap<>()).put(c.getClass(), c);
    }

    public <T extends Component> void removeComponent(Entity e, Class<T> c) {
        for (Component cc : registry.get(e).values()) if (registry.get(e) != null) registry.get(e).remove(c);
    }

    public <T extends Component> T getComponent(Entity e, Class<T> c) {
        for (Component cc : registry.get(e).values()) if (c.isInstance(cc)) return c.cast(cc);
        return null;
    }

    public <T extends Component> boolean hasComponent(Entity e, Class<?> c) {
        return registry.get(e).containsKey(c);
    }
}