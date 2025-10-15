// Copyright (c) October 2025 Félix-Olivier Dumas. All rights reserved.
// Licensed under the terms described in the LICENSE file

package com.ECS.ecs;

public class Entity {
    protected static int nextId = 0;
    protected int id;

    public Entity() { id = nextId++; }
    public int getId() { return id; }
}