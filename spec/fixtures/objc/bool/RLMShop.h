// DO NOT EDIT | Generated by gyro

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Imports

#import <Realm/Realm.h>

#pragma mark - Defines & Constants

extern const struct RLMShopAttributes {
    __unsafe_unretained NSString *isOpened;
    __unsafe_unretained NSString *isValid;
    __unsafe_unretained NSString *name;
} RLMShopAttributes;

////////////////////////////////////////////////////////////////////////////////

#pragma mark - Interface

@interface RLMShop : RLMObject

#pragma mark - Properties

@property BOOL isOpened;
@property BOOL isValid;
@property NSString *name;

@end