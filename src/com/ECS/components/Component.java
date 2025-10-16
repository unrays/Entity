// Copyright (c) October 2025 Félix-Olivier Dumas. All rights reserved.
// Licensed under the terms described in the LICENSE file
 
package com.ECS.components;

import com.ECS.ecs.Entity;

public abstract class Component {
    protected void update(Entity e, float dt) { System.out.println("Updating component..."); }
}
