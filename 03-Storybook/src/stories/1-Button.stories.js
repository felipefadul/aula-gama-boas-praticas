import React from 'react';
import { action } from '@storybook/addon-actions';
import { Button } from '@storybook/react/demo';

export default { 
  title: 'Button',
  component: Button,
};

export const withText = () => <Button onClick={action('clicked')}>Hello Button</Button>;

export const withEmoji = () => (
  <Button onClick={action('clicked')}>
    <span role="img" aria-label="so cool">
      😀 😎 👍 💯
    </span>
  </Button>
);