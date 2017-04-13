// DO NOT EDIT | Generated by gyro

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Imports

#import <Realm/Realm.h>
#import "RLMTypes.h"

#pragma mark - Defines & Constants

extern const struct RLMShopAttributes {
    __unsafe_unretained NSString *name;
    __unsafe_unretained NSString *optionalValue;
    __unsafe_unretained NSString *type;
} RLMShopAttributes;

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Interface

@interface RLMShop : RLMObject

#pragma mark - Properties

@property NSString *name;
@property OptValue optionalValue;
@property RLMType type;

@end