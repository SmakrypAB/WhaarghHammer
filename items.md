___
# items: 	

### table of contents:
[**adamantium_ingot**](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium_ingot)

[**adamantium_block**](https://github.com/SmakrypAB/WhaarghHammer/blob/master/items.md#adamantium-block)

[**adamantium_sword**](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium-sword)
___
# adamantium ingot 

## HOW TO GET: 
smelt adamantium ore (found in the overworld, the nether and end)

<img src="https://cdn.discordapp.com/attachments/390208204984025088/684100817552408619/unknown.png"> <img src="https://media.discordapp.net/attachments/390208204984025088/684097878666510358/unknown.png"> <img src="https://cdn.discordapp.com/attachments/390208204984025088/684098191255404562/unknown.png">

de-craft [adamantium block](https://github.com/SmakrypAB/WhaarghHammer/blob/master/items.md#adamantium-block)

<img src="https://cdn.discordapp.com/attachments/390208204984025088/684096612523573269/unknown.png" alt="adamantium ingot crafting">

### item texture:  
[file link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/lists/ItemList.java#L7)


<img src="https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/assets/whaarghhammer/textures/item/adamantium_ingot.png" alt="adamantium ingot" height="30" width="30"/>

### main register: 

[link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/WhaarghHammer.java#L85)

<details>
<summary>click to view registry code</summary>
<p>

```java
ItemList.adamantium_ingot = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("adamantium_ingot")),
```
</p>
</details>

### lang file: [link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/resources/assets/whaarghhammer/lang/en_us.json#L2)

<details>
<summary>click to view lang file code</summary>
<p>

```json
"item.whaarghhammer.adamantium_ingot": "adamantium ingot",
```

</p>
</details>


### recipe [link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/data/whaarghhammer/recipes/tutorial_item_crafting.json)

<details>
<summary>click to view recipe code</summary>
<p>

```json
{
	"type": "minecraft:crafting_shapeless",
	"ingredients": [
		{ "item": "whaarghhammer:tutorial_block" }
	],
	"result": {
		"item": "whaarghhammer:tutorial_item",
		"count": 9
 	}
}
```

</p>
</details>


## items that use adamantium ingot in crafting:
### tools: 
|  TOOL | INGOTS NEEDED |
| ------------- |:-------------:|
| [adamantium sword](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium-sword) | 2 INGOTS |
| adamantium axe | 3 INGOTS |
| adamantium hoe | 2 INGOTS |
| adamantium pickaxe | 3 INGOTS |
| adamantium shovel | 1 INGOT |
| total: | 11 INGOTS |
### Power Armor:
| ARMOR PIECE | INGOTS NEEDED |
| ------------- |:-------------:|
| power helmet | 5 INGOTS |
| power chestplate | 8 INGOTS | 
| power leggings | 7 INGOTS  |
| power boots | 4 INGOTS |
| total: | 24 INGOTS |
### Blocks:

adamantium block
|  BLOCK | INGOTS NEEDED |
| ------------- |:-------------:|
| [adamantium block](https://github.com/SmakrypAB/WhaarghHammer/blob/master/items.md#adamantium-block) | 9 |
| total | 9 |
___

# Adamantium Block


## HOW TO GET:

put 9 [adamantium ingot](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium_ingot)'s into a crafting table


<img src="https://cdn.discordapp.com/attachments/390208204984025088/685660829617618958/unknown.png" alt="adamantium block crafting">

### item texture:  
[file link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/lists/ItemList.java#L7)


<img src="https://github.com/SmakrypAB/WhaarghHammer/blob/master/src/main/resources/assets/whaarghhammer/textures/block/adamantium_block.png" alt="adamantium block" height="30" width="30"/>


### main register: 

[link](https://github.com/SmakrypAB/WhaarghHammer/blob/9b2fddaee1c97e26d90f52a338ec47521984f535/src/main/java/smakrypsletaren/whaarghhammer/WhaarghHammer.java#L107)

<details>
<summary>click to view registry code</summary>
<p>

```java
ItemList.adamantium_block = new BlockItem(BlockList.adamantium_block, new Item.Properties().group(WhaarghH)).setRegistryName(BlockList.adamantium_block.getRegistryName()),
```
</p>
</details>


### lang file: [link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/resources/assets/whaarghhammer/lang/en_us.json#L2)


<details>
<summary>click to view lang file code</summary>
<p>

```json
"item.whaarghhammer.adamantium_block": "adamantium block",
```

</p>
</details>

### recipe [link](https://github.com/SmakrypAB/WhaarghHammer/blob/master/src/main/resources/data/whaarghhammer/recipes/adamantium_block.json)

<details>
<summary>click to view recipe code</summary>
<p>

```json
  
{
	"type": "minecraft:crafting_shaped",
	"pattern": [
		"XXX",
		"XXX",
		"XXX"
	],
	"key": {
		"X": {
			"item": "whaarghhammer:adamantium_ingot"
		}
	},
	"result": {
		"item": "whaarghhammer:adamantium_block"
 	}
}
```

</p>
</details>

## items that use adamantium ingot in crafting:

|  ITEM | BLOCKS NEEDED |
| ------------- |:-------------:|
| adamantium ingot | 1 |
| total | 1 |

## block list
[link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4-out-dated-/blob/master/src/main/java/smakrypsletaren/whaarghhammer/lists/BlockList.java)

___

# adamantium sword

## how to get:
place 2 [adamantium ingots](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium_ingot) over a stick in the crafting table

## crafting: 

<img src="https://cdn.discordapp.com/attachments/390208204984025088/684093543366524982/unknown.png" alt="adamantium sword crafting">

### item texture:  
[file link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/lists/ItemList.java#L7)


<img src="https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/assets/whaarghhammer/textures/item/adamantium_sword.png" alt="adamantium sword" height="30" width="30"/>

### main register:

[link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/445bb9d78873a7919067a13e5e98c70dc85981f3/src/main/java/smakrypsletaren/whaarghhammer/WhaarghHammer.java#L94)

### itemlist

[link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/dfba025200b4dbf5bd9bce26412028bca9ef915f/src/main/java/smakrypsletaren/whaarghhammer/lists/ItemList.java#L9)

### recipe link

[recipe link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/data/whaarghhammer/recipes/adamantium_sword.json)


<details>
<summary>click to view recipe code</summary>
<p>

```json
{
	"type": "minecraft:crafting_shaped",
	"pattern": [
		"X",
		"X",
		"#"
	],
	"key": {
		"#": {
 			"item": "minecraft:stick"
		},
		"X": {
			"item": "whaarghhammer:adamantium_ingot"
		}
	},
	"result": {
		"item": "whaarghhammer:adamantium_sword"
 	}
}
```
</details>
</p>

[recipe advancement link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/data/whaarghhammer/advancements/recipes/misc/tutorial_sword.json)

<details>
<summary>click to view recipe advancement code</summary>
<p>


```json
{
    "parent": "minecraft:recipes/root",
    "rewards": {
        "recipes": [
            "whaarghhammer:tutorial_sword"
        ]
    },
    "criteria": {
        "has_ingot": {
            "trigger": "minecraft:inventory_changed",
            "conditions": {
                "items": [
                    {
                        "item": "whaarghhammer:tutorial_item"
                    }
                ]
            }
        },
        "has_the_recipe": {
            "trigger": "minecraft:recipe_unlocked",
            "conditions": {
                "recipe": "whaarghhammer:tutorial_sword"
            }
        }
    },
    "requirements": [
        [
            "has_ingot",
            "has_the_recipe"
        ]
    ]
}
```
</p>
</details>

## Atributes:

|  attribute | value |
| ------------- |:-------------:|
| attack damage | 11 |
| attack speed | 10 |
| durability | 1600 |
| harvest level | 3 |
| enchantability | 25  |
| repair item | adamantium ingot | 

[tool material list (master for attributes)](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/java/smakrypsletaren/whaarghhammer/lists/ToolMaterialList.java)

<details>
<summary>view attributes code (simplified)</summary>
<p>

```java

public enum ToolMaterialList implements IItemTier
{
 // these values (10.0f, 9.0f, 1600, 3, 25,) are constant values
	tutorial(10.0f, 9.0f, 1600, 3, 25, ItemList.tutorial_item);
  // here the defined values get used in order of what value was written first and gets put into a variable
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
  // the variables get turned into @override readable values that will replace the source code
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}
```

```java
ItemList.tutorial_sword = new SwordItem(ToolMaterialList.tutorial, 0, 6.0f, new Item.Properties().group(WhaarghH)).setRegistryName(location("tutorial_sword")),
```

</p>
</details>

___

